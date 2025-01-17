public class variable {
    public static void main(String[] args) {
        int x; //정수를 저장하기 위한 변수 x 선언
//      int x = 3; //한줄로 변수 선언, 대입
        x =5; //변수 x에 5 저장
        x =3; // x에 3 저장

        System.out.println(x);

        //변수를 사용하면 좋은 점----------------------------------------------------------------------
        System.out.println(5+3);
        System.out.println(5-3);
        //이렇게 직접 숫자를 쳐서 계산 결과를 얻을 수 있지만 피연산자를 변경해야 할 때 너무 많은 숫자를 변경해야하는 상황이 발생한다.

        x=4; //원래 있던 변수에 값을 다시 저장하기 때문에 int 없이
        int y=3;
        System.out.println(x+y);
        System.out.println(x-y);
        //변수를 사용하면 피연산자의 값을 바꾸고 싶을 때  변수만 다시 초기화 해주면 편하게 사용할 수 있다.
        //----------------------------------------------------------------------------------------------

        //변수 값 바꾸기----------------------------------------------------------------------------------
        int d = 5;
        int e = 6;
        // x와 y의 값을 바꾸고 싶을 때

        int tmp; //임시로 값을 저장하기 위한 공간

        //x의 값을 임시로 만든 tmp 공간에 옮겨놓고 y의 값을 x에 대입한다. y는 x가 임시로 저장해둔 tmp에서 값을 가져온다.
        tmp=d;
        d=e;
        e=tmp;
        //-----------------------------------------------------------------------------------------------

        //상수-------------------------------------------------------------------------------------------
        final int f;
        f= 100; // 상수 첫 초기화로 OK
        //f= 150; // 상수는 저장된 값을 변경 불가능 //java: variable f might already have been assigned
        //----------------------------------------------------------------------------------------------
    }
}
