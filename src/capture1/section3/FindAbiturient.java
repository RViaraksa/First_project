package capture1.section3;

import java.util.*;

public class FindAbiturient {
    public List<Abiturient> findAbiturientAtRate(int label, List<Abiturient> abiturients) {   //метод возращайщий список студентов ссответствующих выбранному балу, либо равный либо более высокую
        ArrayList<Abiturient> returnAbiturients = new ArrayList<>();
        Iterator<Abiturient> iter = abiturients.iterator();
        while (iter.hasNext()) {             //защита от открытия null , т.к. ылетает NoSuchElementException
            Abiturient current = iter.next();   //рисваиваемм ссылк объект списка на котром указатель итератора находится ы данный момент
            if (current.getMark() >= label)
                returnAbiturients.add(current);
        }
        return returnAbiturients;
    }

    public List<Abiturient> topAbiturient(int amount, List<Abiturient> list) {
        int count = 0;
        List<Abiturient> sortAbiturients = new ArrayList<>();
        AbiturientComparatot comparator = new AbiturientComparatot(SortTypeAbiturient.MARK);
        sortAbiturients = (ArrayList<Abiturient>) list;
        Collections.sort(sortAbiturients,comparator);
        Iterator<Abiturient> iterator = sortAbiturients.iterator();
        while (iterator.hasNext()){
            if(count >= amount)
                break;
            count++;
        }
        return sortAbiturients = (List<Abiturient>) sortAbiturients.subList(0,count);
    }

    private enum SortTypeAbiturient{        //Перечесления даю-ее возможность выбрать тип по которому реа-ся компаратор
        ABITURIENT_ID , MARK
    }

    private class AbiturientComparatot implements Comparator<Abiturient>{
        private SortTypeAbiturient index;
        public AbiturientComparatot(SortTypeAbiturient index){
            setIndex(index);
        }

        public final void setIndex(SortTypeAbiturient index) {
            this.index = index;                 //*д.б. исключение если индекса равен null
        }

        public SortTypeAbiturient getIndex(){
            return this.index;
        }

        @Override
        public int compare(Abiturient o1, Abiturient o2) {         //метод реализующий интерфйс компаратор
            switch (index){
                case MARK:
                    return -(o1.getMark()-o2.getMark());        //знак "-" для того чтобы сортировка проходила по убыванию а не возрастанию, т.е. сразу большое значение пготом меньшее
                case ABITURIENT_ID:
                    return (int) (o1.getId()-o2.getId());
                default:
                    return 0;                       //по хорошему надо выбрасывать исключение ошибка метода сортировки
            }
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }
    }
}
