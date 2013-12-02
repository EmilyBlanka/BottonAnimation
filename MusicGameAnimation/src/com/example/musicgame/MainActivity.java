/*http://www.atmarkit.co.jp/ait/articles/1009/15/news120_2.html
 (フレームアニメーション)http://monoist.atmarkit.co.jp/mn/articles/1205/21/news003.html
*/

package com.example.musicgame;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.animation.AnimationSet;
import android.view.animation.CycleInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button btn1 = (Button)findViewById(R.id.button1);
			
		//AnimationSet(boolean shareInterpolator)
		AnimationSet set = new AnimationSet(false);
		
		/*RotateAnimation(float from, float to, float pivotX, float pivotY)
		（開始角度,　終了角度, 回転中心のX座標,　回転中心のY座標)*/
		RotateAnimation rotate = new RotateAnimation(0, 180, 65, 45);
		//ScaleAnimation(float fromX, float toX, float fromY, float toY, float pivotX, float pivotY)
		ScaleAnimation scale = new ScaleAnimation(0.1f,1.0f,0.1f,1.0f,65,45);
		
		//くるくる回転しながら
		set.addAnimation(rotate);
		//スケールが変化する/
		set.addAnimation(scale);
				
		set.setDuration(400);
		
		set.setInterpolator(new CycleInterpolator(1));
		 
		//アニメーションスタート
		btn1.startAnimation(set);
		 
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
