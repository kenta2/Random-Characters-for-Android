package caryl_hafod.RandomChars;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class RandomChars extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getApplicationContext(), "Hello!", Toast.LENGTH_SHORT).show();
        finish();
    }
}
