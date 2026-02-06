package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

@Deprecated
/* renamed from: o.Ud2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4399Ud2 {
    public static final String i = "StreamVolumeManager";
    public static final String j = "android.media.VOLUME_CHANGED_ACTION";
    public final Context a;
    public final Handler b;
    public final b c;
    public final AudioManager d;
    @InterfaceC11300zs1
    public c e;
    public int f;
    public int g;
    public boolean h;

    /* renamed from: o.Ud2$b */
    /* loaded from: classes2.dex */
    public interface b {
        void e(int i);

        void j(int i, boolean z);
    }

    /* renamed from: o.Ud2$c */
    /* loaded from: classes2.dex */
    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = C4399Ud2.this.b;
            final C4399Ud2 c4399Ud2 = C4399Ud2.this;
            handler.post(new Runnable() { // from class: o.Vd2
                @Override // java.lang.Runnable
                public final void run() {
                    C4399Ud2.this.o();
                }
            });
        }
    }

    public C4399Ud2(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.c = bVar;
        AudioManager audioManager = (AudioManager) C9542sf.k((AudioManager) applicationContext.getSystemService("audio"));
        this.d = audioManager;
        this.f = 3;
        this.g = h(audioManager, 3);
        this.h = f(audioManager, this.f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter(j));
            this.e = cVar;
        } catch (RuntimeException e) {
            I31.o(i, "Error registering stream volume receiver", e);
        }
    }

    public static boolean f(AudioManager audioManager, int i2) {
        if (TD2.a >= 23) {
            return audioManager.isStreamMute(i2);
        }
        if (h(audioManager, i2) == 0) {
            return true;
        }
        return false;
    }

    public static int h(AudioManager audioManager, int i2) {
        try {
            return audioManager.getStreamVolume(i2);
        } catch (RuntimeException e) {
            I31.o(i, "Could not retrieve stream volume for stream type " + i2, e);
            return audioManager.getStreamMaxVolume(i2);
        }
    }

    public void c(int i2) {
        if (this.g <= e()) {
            return;
        }
        this.d.adjustStreamVolume(this.f, -1, i2);
        o();
    }

    public int d() {
        return this.d.getStreamMaxVolume(this.f);
    }

    public int e() {
        int streamMinVolume;
        if (TD2.a >= 28) {
            streamMinVolume = this.d.getStreamMinVolume(this.f);
            return streamMinVolume;
        }
        return 0;
    }

    public int g() {
        return this.g;
    }

    public void i(int i2) {
        if (this.g >= d()) {
            return;
        }
        this.d.adjustStreamVolume(this.f, 1, i2);
        o();
    }

    public boolean j() {
        return this.h;
    }

    public void k() {
        c cVar = this.e;
        if (cVar != null) {
            try {
                this.a.unregisterReceiver(cVar);
            } catch (RuntimeException e) {
                I31.o(i, "Error unregistering stream volume receiver", e);
            }
            this.e = null;
        }
    }

    public void l(boolean z, int i2) {
        int i3;
        if (TD2.a >= 23) {
            AudioManager audioManager = this.d;
            int i4 = this.f;
            if (z) {
                i3 = -100;
            } else {
                i3 = 100;
            }
            audioManager.adjustStreamVolume(i4, i3, i2);
        } else {
            this.d.setStreamMute(this.f, z);
        }
        o();
    }

    public void m(int i2) {
        if (this.f == i2) {
            return;
        }
        this.f = i2;
        o();
        this.c.e(i2);
    }

    public void n(int i2, int i3) {
        if (i2 >= e() && i2 <= d()) {
            this.d.setStreamVolume(this.f, i2, i3);
            o();
        }
    }

    public final void o() {
        int h = h(this.d, this.f);
        boolean f = f(this.d, this.f);
        if (this.g == h && this.h == f) {
            return;
        }
        this.g = h;
        this.h = f;
        this.c.j(h, f);
    }
}
