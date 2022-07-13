public class EstudoGeral {

    public static void execicios()
    {
        byte b1 = 10;
        byte b2 = 20;
        short s1 = 20000;
        int i=28500;
        long l1=1000000000000000000L;
        float f = 10.60f;
        double d = 99.84d;
        char c = 'w';
        String nome = "Adria Aline";

        System.out.println(nome);

        int k=2,i2=0;
        i2 = ++k; // Mesmo que: i= k+1
        System.out.println(i2);

        int j=0;
        j = --k; // Mesmo que: i= k+1
        System.out.println(j);

        k = 9%2; //Operador mode ,k recebe o resto da divisão de 15/4
        System.out.println("Mod: " +k);
    }

    public static void prePos(){
        int k = 10;

        int i = ++k; // I recebe K+1,ou seja,11.0
        int j = k--; // J = K ; K = K-1
        int x = k;
        System.out.println("prePos ++k: " + i );
        System.out.println("prePos: k--: " + j );
        System.out.println("prePos:" + x );
    }

    public static void atribuicao(){
        int i= 1500;
        short j= 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("--ATRIBUIÇÃO--");
        System.out.println("D recebendo F: "+d);

        i += 5; // i = i + 5
        j -= 3; // j = j - 3
        d /= 2.7d; // d = d / 2.7d
        l *= 3; // l = l * 3
        k %= 2 ; // k = k % 2

        System.out.println(i);
        System.out.println(j);
        System.out.println(d);
        System.out.println(l);
        System.out.println(k);

        i = k = j;
        System.out.println("K: "+k);
        System.out.println("J: "+j);
    }
    public static void precedencia(){
        int i = 10;
        int j = 20;
        int k = 30;
        int a = i++ + --j * k; // 10 + 19 * 30 -> 10 + 570 -> 580 (order --,depois *)
        System.out.println("i++ + --i * k :" +a);
        System.out.println("i :" +i); // 11 Faz toda expressão para depois mudar o valor de i

        int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1 ( i ja valendo 11 ! )

        System.out.println("k / --i % 3 + 1 :" +b);
        System.out.println("i :" +i); // agora i vale 10

        int c = 2;
        // neste caso,para resolver ,prevalece a soma +=!
        c *= i += 5; // c = 2 * i ;i = i + 5 -> 2 * i ; i = 10 + 5 ; -> c = 2 * 15; c = 30
        System.out.println("c *= i += 5 :" +c);
    }

    public static void testarCasting(){
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        long l1;
        int i1 = 10 ;
        l1 = i1;

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2;

        System.out.println(i2);
    }



}
