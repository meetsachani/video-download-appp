package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.VideoPlayer;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Icon;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.SeekBar;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.VideoPlayer.VideoPlayActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.File;
import java.util.ArrayList;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C10180vG2;
import o.C10201vM;
import o.C10426wG2;
import o.C10669xG2;
import o.C10912yG2;
import o.C11155zG2;
import o.C5036aE2;
import o.C8186n6;
import o.C9937uG2;
import o.LG;

/* loaded from: classes3.dex */
public class VideoPlayActivity extends ActivityC3020Gb implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {
    public C8186n6 C1;
    public ArrayList<File> H1;
    public long K1;
    public long L1;
    public long M1;
    public BroadcastReceiver N1;
    public RemoteAction O1;
    public int D1 = -1;
    public boolean E1 = false;
    public boolean F1 = false;
    public boolean G1 = false;
    public boolean I1 = true;
    public boolean J1 = false;
    public final Runnable P1 = new h();

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoPlayActivity.this.R().l();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends AbstractC2891Eu1 {
        public b(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(VideoPlayActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VideoPlayActivity.this.I1) {
                Log.d("TAG854", "onClick isPlaying: ");
            } else {
                Log.d("TAG854", "onClick isPlaying else: ");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Log.d("TAG854", "onReceive: " + intent.getAction());
            if ("com.example.ACTION_PLAY".equals(intent.getAction())) {
                Log.d("TAG854", "onReceive ACTION_PLAY: ");
            } else if ("com.example.ACTION_PAUSE".equals(intent.getAction())) {
                Log.d("TAG854", "onReceive ACTION_PAUSE: ");
            } else if ("com.example.ACTION_PLAY_PAUSE".equals(intent.getAction())) {
                Log.d("TAG854", "onReceive ACTION_PLAY_PAUSE: ");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoPlayActivity videoPlayActivity = VideoPlayActivity.this;
            videoPlayActivity.C1.b.setColorFilter(C10201vM.g(videoPlayActivity.getApplicationContext(), R.color.white));
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoPlayActivity videoPlayActivity = VideoPlayActivity.this;
            videoPlayActivity.C1.e.setColorFilter(C10201vM.g(videoPlayActivity.getApplicationContext(), R.color.white));
        }
    }

    /* loaded from: classes3.dex */
    public class g implements MediaPlayer.OnPreparedListener {
        public g() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            VideoPlayActivity videoPlayActivity = VideoPlayActivity.this;
            videoPlayActivity.C1.r.setText(videoPlayActivity.H1.get(videoPlayActivity.D1).getName());
            VideoPlayActivity videoPlayActivity2 = VideoPlayActivity.this;
            videoPlayActivity2.C1.r.setTextColor(C10201vM.g(videoPlayActivity2.getApplicationContext(), R.color.white));
            C8186n6 c8186n6 = VideoPlayActivity.this.C1;
            c8186n6.f820o.setMax(c8186n6.s.getDuration());
            VideoPlayActivity videoPlayActivity3 = VideoPlayActivity.this;
            videoPlayActivity3.K1 = videoPlayActivity3.C1.s.getDuration();
            VideoPlayActivity videoPlayActivity4 = VideoPlayActivity.this;
            videoPlayActivity4.L1 = (videoPlayActivity4.K1 / 1000) / 60;
            VideoPlayActivity videoPlayActivity5 = VideoPlayActivity.this;
            videoPlayActivity5.M1 = (videoPlayActivity5.K1 / 1000) % 60;
            if (VideoPlayActivity.this.L1 < 10 && VideoPlayActivity.this.M1 < 10) {
                AppCompatTextView appCompatTextView = VideoPlayActivity.this.C1.p;
                appCompatTextView.setText("0" + VideoPlayActivity.this.L1 + ":0" + VideoPlayActivity.this.M1);
            } else if (VideoPlayActivity.this.L1 < 10) {
                AppCompatTextView appCompatTextView2 = VideoPlayActivity.this.C1.p;
                appCompatTextView2.setText("0" + VideoPlayActivity.this.L1 + ":" + VideoPlayActivity.this.M1);
            } else if (VideoPlayActivity.this.M1 < 10) {
                AppCompatTextView appCompatTextView3 = VideoPlayActivity.this.C1.p;
                appCompatTextView3.setText(VideoPlayActivity.this.L1 + ":0" + VideoPlayActivity.this.M1);
            } else {
                AppCompatTextView appCompatTextView4 = VideoPlayActivity.this.C1.p;
                appCompatTextView4.setText(VideoPlayActivity.this.L1 + ":" + VideoPlayActivity.this.M1);
            }
            VideoPlayActivity.this.C1.s.start();
            VideoPlayActivity.this.C1.c.setImageResource(R.drawable.ic_pause_64dp);
            VideoPlayActivity.this.I1 = true;
            VideoPlayActivity videoPlayActivity6 = VideoPlayActivity.this;
            videoPlayActivity6.C1.f820o.postDelayed(videoPlayActivity6.P1, 1000L);
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8186n6 c8186n6 = VideoPlayActivity.this.C1;
            c8186n6.f820o.setProgress(c8186n6.s.getCurrentPosition());
            if (VideoPlayActivity.this.C1.s.isPlaying()) {
                VideoPlayActivity videoPlayActivity = VideoPlayActivity.this;
                videoPlayActivity.C1.f820o.postDelayed(videoPlayActivity.P1, 1000L);
            }
        }
    }

    public static /* synthetic */ void F1(VideoPlayActivity videoPlayActivity, MediaPlayer mediaPlayer) {
        if (videoPlayActivity.F1) {
            videoPlayActivity.Y1();
        }
    }

    private void S1() {
        this.D1 = getIntent().getIntExtra("position", 0);
        String stringExtra = getIntent().getStringExtra(C5036aE2.a);
        this.H1 = new ArrayList<>();
        this.H1 = LG.c(new File(stringExtra));
        Y1();
        this.C1.d.setOnClickListener(new c());
        this.C1.f820o.setOnSeekBarChangeListener(this);
        this.C1.l.setOnClickListener(this);
        this.C1.n.setOnClickListener(this);
        this.C1.m.setOnClickListener(this);
        this.C1.j.setOnClickListener(this);
        this.C1.k.setOnClickListener(this);
        this.C1.c.setOnClickListener(this);
        this.C1.e.setOnClickListener(this);
        this.C1.b.setOnClickListener(this);
        this.C1.g.setOnClickListener(this);
    }

    public final boolean P1() {
        if (Settings.System.canWrite(this)) {
            return true;
        }
        V1();
        return false;
    }

    public final PendingIntent Q1(Context context) {
        return PendingIntent.getBroadcast(context, 0, new Intent("com.example.ACTION_PLAY_PAUSE"), 67108864);
    }

    public final void R1() {
        this.J1 = false;
        this.C1.i.setVisibility(8);
        this.C1.r.setVisibility(8);
        this.C1.c.setVisibility(8);
        this.C1.b.setVisibility(8);
        this.C1.e.setVisibility(8);
        this.C1.f.setVisibility(8);
        this.C1.h.setVisibility(8);
    }

    public final void T1() {
        this.C1.b.setColorFilter(C10201vM.g(getApplicationContext(), R.color.colorDarkGrey));
        new Handler(Looper.getMainLooper()).postDelayed(new e(), 500L);
        if (this.D1 < this.H1.size() - 1) {
            this.D1++;
            Y1();
            return;
        }
        Toast.makeText(this, "Next Video Not Available", 0).show();
    }

    public final void U1() {
        this.C1.e.setColorFilter(C10201vM.g(getApplicationContext(), R.color.colorDarkGrey));
        new Handler(Looper.getMainLooper()).postDelayed(new f(), 500L);
        if (this.H1.size() > 1) {
            if (this.D1 >= this.H1.size() - 1) {
                this.D1--;
                Y1();
                return;
            }
            Toast.makeText(this, "Previous Video Not Available", 0).show();
            return;
        }
        Toast.makeText(this, "Previous Video Not Available", 0).show();
    }

    public final void V1() {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(Uri.parse("package:" + getPackageName()));
        startActivity(intent);
    }

    public final void W1() {
        ArrayList arrayList = new ArrayList();
        PendingIntent Q1 = Q1(getApplicationContext());
        this.O1 = null;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            C11155zG2.a();
            this.O1 = C10669xG2.a(Icon.createWithResource(this, (int) R.drawable.ic_pause_24dp), "Play", "Play or Pause the media", Q1);
        }
        arrayList.add(this.O1);
        if (i >= 31) {
            C10426wG2.a(this, C10180vG2.a(C9937uG2.a(C10912yG2.a(), true)));
        }
        enterPictureInPictureMode();
    }

    public final void X1() {
        this.J1 = true;
        this.C1.i.setVisibility(0);
        this.C1.r.setVisibility(0);
        this.C1.c.setVisibility(0);
        this.C1.b.setVisibility(0);
        this.C1.e.setVisibility(0);
        this.C1.f.setVisibility(0);
        this.C1.h.setVisibility(0);
    }

    public final void Y1() {
        this.C1.s.setVideoPath(this.H1.get(this.D1).getPath());
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(this.C1.s);
        mediaController.setMediaPlayer(this.C1.s);
        this.C1.s.setOnPreparedListener(new g());
        this.C1.s.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: o.AG2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                VideoPlayActivity.F1(VideoPlayActivity.this, mediaPlayer);
            }
        });
        R1();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.ivPictureInPicture) {
            W1();
        }
        if (view.getId() == R.id.btnPlay) {
            if (this.I1) {
                this.C1.c.setImageResource(R.drawable.ic_play_arrow_64dp);
                this.I1 = false;
                this.C1.s.pause();
                Log.d("TAG5200", "onClick isPlaying: ");
            } else {
                this.C1.c.setImageResource(R.drawable.ic_pause_64dp);
                this.I1 = true;
                this.C1.s.start();
                this.C1.f820o.postDelayed(this.P1, 1000L);
                Log.d("TAG5200", "onClick isNotPlaying: ");
            }
        }
        if (view.getId() == R.id.btnPrev) {
            U1();
        }
        if (view.getId() == R.id.btnNext) {
            T1();
        }
        if (view.getId() == R.id.clControls) {
            if (this.J1) {
                R1();
            } else {
                X1();
            }
        }
        if (view.getId() == R.id.ivRotation) {
            Log.d("TAG85222", "onClick: " + this.E1);
            if (this.E1) {
                this.C1.n.setImageDrawable(C10201vM.l(getApplicationContext(), R.drawable.rotation_on));
            } else {
                this.C1.n.setImageDrawable(C10201vM.l(getApplicationContext(), R.drawable.rotation_off));
            }
            if (P1()) {
                C5036aE2.t(this, this.E1);
                this.E1 = !this.E1;
            }
        }
        if (view.getId() == R.id.ivRepeat) {
            boolean z = this.F1;
            this.F1 = !z;
            if (!z) {
                Toast.makeText(this, "Repeat On", 0).show();
            } else {
                Toast.makeText(this, "Repeat Off", 0).show();
            }
        }
        if (view.getId() == R.id.ivLock) {
            this.G1 = true;
            this.C1.k.setVisibility(0);
            this.C1.g.setVisibility(8);
        }
        if (view.getId() == R.id.ivLockRelease) {
            this.G1 = false;
            this.C1.k.setVisibility(8);
            this.C1.g.setVisibility(0);
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8186n6 c2 = C8186n6.c(getLayoutInflater());
        this.C1 = c2;
        setContentView(c2.getRoot());
        S1();
        this.C1.i.setOnClickListener(new a());
        R().e(new b(true));
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onPause() {
        super.onPause();
        if (!isInPictureInPictureMode() && this.C1.s.isPlaying()) {
            this.C1.s.pause();
            this.C1.c.setImageResource(R.drawable.ic_play_arrow_64dp);
            this.I1 = false;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 26) {
            super.onPictureInPictureModeChanged(z, configuration);
        }
        if (z) {
            R1();
            this.N1 = new d();
            return;
        }
        this.N1 = null;
        X1();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Log.d("TAG21212", "onProgressChanged: " + i);
        if (z) {
            this.C1.s.seekTo(i);
        }
        int i2 = i / 1000;
        long j = i2 / 60;
        this.L1 = j;
        long j2 = i2 % 60;
        this.M1 = j2;
        if (j < 10 && j2 < 10) {
            this.C1.q.setText("0" + this.L1 + ":0" + this.M1);
        } else if (j < 10) {
            this.C1.q.setText("0" + this.L1 + ":" + this.M1);
        } else if (j2 < 10) {
            this.C1.q.setText(this.L1 + ":0" + this.M1);
        } else {
            this.C1.q.setText(this.L1 + ":" + this.M1);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.C1.s.pause();
    }

    @Override // o.ActivityC3020Gb, o.ActivityC4864Yy0, android.app.Activity
    public void onStop() {
        this.C1.s.pause();
        super.onStop();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        this.C1.s.start();
    }
}
