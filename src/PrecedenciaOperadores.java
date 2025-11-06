public class PrecedenciaOperadores {

    public static void main(String[] args) {
//Estudia el orden de preferecia de los operadores
        System.out.println(3+5==4*2&&1.2>1.15||'a'=='b');
        System.out.println(3+5==4*2&&1.2<1.15||'a'=='b');
        System.out.println((3+5==4*2)&&(1.2>1.15||'a'=='b'));
        System.out.println((3*5==4+2&&1.2>1.15)||('a'=='b'));
//Practica tú mismo modificando las expresiones
//y quitando y poniendo paréntesis
    }
}
