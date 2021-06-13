package stream;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StreamTest01 {

    private Calculator cal;

    @Before
    public void set(){
        this.cal = new Calculator();
    }

    @Test
    public void sum(){
        assertThat(cal.sum(1,1) , is(2));
    }

    @Test
    public void multiply1(){
        assertThat(cal.multiply1(3,5),is(15));
    }

    @Test
    public void multiply2(){
        assertThat(cal.multiply2(8,6),is(48));
    }

    @Test
    public void multiply3(){
        assertThat(cal.multiply3(8,6),is(48));
    }


}
