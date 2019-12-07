package ru.myitschool.jenyaiu90.itsssim;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity
{
	private int end;
	ImageView image;
	@Override
	public void onCreate(Bundle sis)
	{
		super.onCreate(sis);
		setContentView(R.layout.result);
		end = Integer.parseInt(getIntent().getStringExtra("end"));
		image = (ImageView)findViewById(R.id.image);
		switch (end)
		{
			case 5:
				image.setImageResource(R.drawable.r05);
				break;
			case 9:
				image.setImageResource(R.drawable.r09);
				break;
			case 11:
				image.setImageResource(R.drawable.r11);
				break;
			case 13:
				image.setImageResource(R.drawable.r13);
				break;
			case 14:
				image.setImageResource(R.drawable.r14);
				break;
			case 15:
				image.setImageResource(R.drawable.r15);
				break;
			case 17:
				image.setImageResource(R.drawable.r17);
				break;
			case 18:
				image.setImageResource(R.drawable.r18);
				break;
			case 19:
				image.setImageResource(R.drawable.r19);
				break;
			case 20:
				image.setImageResource(R.drawable.r20);
				break;
			case 21:
				image.setImageResource(R.drawable.r21);
				break;
			case 22:
				image.setImageResource(R.drawable.r22);
				break;
			case 24:
				image.setImageResource(R.drawable.r24);
				break;
			case 25:
				image.setImageResource(R.drawable.r25);
				break;
			case 28:
				image.setImageResource(R.drawable.r28);
				break;
			case 29:
				image.setImageResource(R.drawable.res29);
				break;
			case 31:
				image.setImageResource(R.drawable.r31);
				break;
			case 32:
				image.setImageResource(R.drawable.r32);
				break;
			case 33:
				image.setImageResource(R.drawable.r33);
				break;
			case 34:
				image.setImageResource(R.drawable.r34);
				break;
			case 35:
				image.setImageResource(R.drawable.res35);
				break;
			case 36:
				image.setImageResource(R.drawable.res36);
				break;
			case 37:
				image.setImageResource(R.drawable.res37);
				break;
			case 38:
				image.setImageResource(R.drawable.res38);
				break;
			case 39:
				image.setImageResource(R.drawable.res39);
				break;
			case 40:
				image.setImageResource(R.drawable.res40);
				break;
			case 41:
				image.setImageResource(R.drawable.res41);
				break;
			case 42:
				image.setImageResource(R.drawable.res42);
				break;
			case 43:
				image.setImageResource(R.drawable.res43);
				break;
		}
	}
}
