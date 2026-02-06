package o;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

/* loaded from: classes3.dex */
public class DS2 {
    public static DS2 d;
    public Context a;
    public MediaPlayer b = null;
    public String c = "de_mp";

    /* loaded from: classes3.dex */
    public class a implements MediaPlayer.OnPreparedListener {
        public final /* synthetic */ c X;

        public a(c cVar) {
            this.X = cVar;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            Log.d(DS2.this.c, "onPrepared: ");
            c cVar = this.X;
            String a = DS2.this.a(mediaPlayer.getDuration());
            cVar.a(a, mediaPlayer.getVideoWidth() + " * " + mediaPlayer.getVideoHeight());
        }
    }

    /* loaded from: classes3.dex */
    public class b implements MediaPlayer.OnBufferingUpdateListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            String str = DS2.this.c;
            Log.d(str, "onBufferingUpdate: " + i);
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(String str, String str2);
    }

    public DS2(Context context) {
        this.a = context;
        d();
    }

    public static DS2 b(Context context) {
        if (d == null) {
            d = new DS2(context);
        }
        return d;
    }

    public String a(int i) {
        int i2 = i / 1000;
        return String.format("%02d:%02d", Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60));
    }

    public void c(String str, c cVar) {
        try {
            String str2 = this.c;
            Log.e(str2, "getVideoMetadata: " + str);
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.b = mediaPlayer;
            mediaPlayer.setDataSource(str);
            this.b.setOnPreparedListener(new a(cVar));
            this.b.setOnBufferingUpdateListener(new b());
            this.b.prepareAsync();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void d() {
        if (this.b == null) {
            this.b = new MediaPlayer();
        }
    }

    public void e() {
        MediaPlayer mediaPlayer = this.b;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.b = null;
        }
    }
}
