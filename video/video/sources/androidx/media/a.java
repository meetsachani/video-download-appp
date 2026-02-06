package androidx.media;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media.AudioAttributesCompat;
import o.C2691Ct1;
import o.C4602Wg;

/* loaded from: classes.dex */
public class a {
    public static final AudioAttributesCompat g = new AudioAttributesCompat.d().e(1).a();
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final AudioAttributesCompat d;
    public final boolean e;
    public final Object f;

    /* renamed from: androidx.media.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0034a {
        public static AudioFocusRequest a(int i, AudioAttributes audioAttributes, boolean z, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Handler.Callback, AudioManager.OnAudioFocusChangeListener {
        public static final int Z = 2782386;
        public final Handler X;
        public final AudioManager.OnAudioFocusChangeListener Y;

        public c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            this.Y = onAudioFocusChangeListener;
            this.X = new Handler(handler.getLooper(), this);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 2782386) {
                this.Y.onAudioFocusChange(message.arg1);
                return true;
            }
            return false;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            Handler handler = this.X;
            handler.sendMessage(Message.obtain(handler, Z, i, 0));
        }
    }

    public a(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z) {
        this.a = i;
        this.c = handler;
        this.d = audioAttributesCompat;
        this.e = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26 && handler.getLooper() != Looper.getMainLooper()) {
            this.b = new c(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.f = C0034a.a(i, a(), z, this.b, handler);
        } else {
            this.f = null;
        }
    }

    public AudioAttributes a() {
        AudioAttributesCompat audioAttributesCompat = this.d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.h();
        }
        return null;
    }

    public AudioAttributesCompat b() {
        return this.d;
    }

    public AudioFocusRequest c() {
        return C4602Wg.a(this.f);
    }

    public Handler d() {
        return this.c;
    }

    public int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.e == aVar.e && C2691Ct1.a(this.b, aVar.b) && C2691Ct1.a(this.c, aVar.c) && C2691Ct1.a(this.d, aVar.d)) {
            return true;
        }
        return false;
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.b;
    }

    public boolean g() {
        return this.e;
    }

    public int hashCode() {
        return C2691Ct1.b(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }

    /* loaded from: classes.dex */
    public static final class b {
        public int a;
        public AudioManager.OnAudioFocusChangeListener b;
        public Handler c;
        public AudioAttributesCompat d;
        public boolean e;

        public b(int i) {
            this.d = a.g;
            d(i);
        }

        public static boolean b(int i) {
            return i == 1 || i == 2 || i == 3 || i == 4;
        }

        public a a() {
            if (this.b != null) {
                return new a(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b c(AudioAttributesCompat audioAttributesCompat) {
            if (audioAttributesCompat != null) {
                this.d = audioAttributesCompat;
                return this;
            }
            throw new NullPointerException("Illegal null AudioAttributes");
        }

        public b d(int i) {
            if (b(i)) {
                this.a = i;
                return this;
            }
            throw new IllegalArgumentException("Illegal audio focus gain type " + i);
        }

        public b e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return f(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        public b f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            if (onAudioFocusChangeListener != null) {
                if (handler != null) {
                    this.b = onAudioFocusChangeListener;
                    this.c = handler;
                    return this;
                }
                throw new IllegalArgumentException("Handler must not be null");
            }
            throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
        }

        public b g(boolean z) {
            this.e = z;
            return this;
        }

        public b(a aVar) {
            this.d = a.g;
            if (aVar != null) {
                this.a = aVar.e();
                this.b = aVar.f();
                this.c = aVar.d();
                this.d = aVar.b();
                this.e = aVar.g();
                return;
            }
            throw new IllegalArgumentException("AudioFocusRequestCompat to copy must not be null");
        }
    }
}
