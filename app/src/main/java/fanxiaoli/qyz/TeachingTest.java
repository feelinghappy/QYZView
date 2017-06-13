package fanxiaoli.qyz;
import android.app.Activity;
import android.os.Bundle;

public class TeachingTest extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int flag = getIntent().getIntExtra("flag", -1);
    }
}