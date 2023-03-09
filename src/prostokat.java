public class prostokat {
    private float bokA;
    private float bokB;

    public prostokat(float bokA, float bokB) {
        setBokA(bokA);
        setBokB(bokB);

    }

    public float getBokA() {
        return bokA;
    }

    public void setBokA(float bokA) {
        if (bokA<0){
            this.bokA = - bokA;
        } else {
            this.bokA = bokA;
        }

    }

    public float getBokB() {
        return bokB;
    }

    public void setBokB(float bokB) {
        if (bokB<0){
            this.bokB = - bokB;
        } else {
            this.bokB = bokB;
        }
    }
    public float ObliczPole(){
        return this.bokA * this.bokB;
    }

    public float ObliczObwod(){
        return 2 * this.bokA * this.bokB;
    }
}
