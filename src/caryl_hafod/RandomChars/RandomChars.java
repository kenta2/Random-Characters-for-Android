package caryl_hafod.RandomChars;
/* Copyright 2011 Ken Takusagawa
 * 
 * This program is free software.  See the file COPYING.
 */
import java.util.Random;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.widget.Toast;

public class RandomChars extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Random rnd=new Random();
        StringBuilder s=new StringBuilder("[");
        for(int i=0;i<8;++i){
        	s.append(Character.valueOf((char) (rnd.nextInt(26)+97)));
        	//for creating the app icon
        	//s.append(Character.valueOf((char) (i+97)));
        }
        s.append("] "); //the trailing space is for prefixing to Subject lines
        ((ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE)).setText(s); //deprecated by Android 3.0
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
        finish();
    }
}
