package o;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Deprecated
/* renamed from: o.Vg  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4505Vg {
    public static final int j = -1;
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 0;
    public static final int n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f646o = 2;
    public static final int p = 3;
    public static final int q = 0;
    public static final int r = 1;
    public static final int s = 2;
    public static final int t = 3;
    public static final int u = 4;
    public static final String v = "AudioFocusManager";
    public static final float w = 0.2f;
    public static final float x = 1.0f;
    public final AudioManager a;
    public final a b;
    @InterfaceC11300zs1
    public c c;
    @InterfaceC11300zs1
    public C9546sg d;
    public int f;
    public AudioFocusRequest h;
    public boolean i;
    public float g = 1.0f;
    public int e = 0;

    /* renamed from: o.Vg$a */
    /* loaded from: classes2.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {
        public final Handler X;

        public a(Handler handler) {
            this.X = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.X.post(new Runnable() { // from class: o.Ug
                @Override // java.lang.Runnable
                public final void run() {
                    C4505Vg.this.i(i);
                }
            });
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Vg$b */
    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* renamed from: o.Vg$c */
    /* loaded from: classes2.dex */
    public interface c {
        void n(float f);

        void o(int i);
    }

    public C4505Vg(Context context, Handler handler, c cVar) {
        this.a = (AudioManager) C9542sf.g((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.c = cVar;
        this.b = new a(handler);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int e(@InterfaceC11300zs1 C9546sg c9546sg) {
        if (c9546sg == null) {
            return 0;
        }
        switch (c9546sg.Z) {
            case 0:
                I31.n(v, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (c9546sg.X == 1) {
                    return 2;
                }
                break;
            case 15:
            default:
                I31.n(v, "Unidentified audio usage: " + c9546sg.Z);
                return 0;
            case 16:
                if (TD2.a < 19) {
                    return 2;
                }
                return 4;
        }
        return 3;
    }

    public final void a() {
        this.a.abandonAudioFocus(this.b);
    }

    public final void b() {
        if (this.e == 0) {
            return;
        }
        if (TD2.a >= 26) {
            c();
        } else {
            a();
        }
        o(0);
    }

    @ES1(26)
    public final void c() {
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest != null) {
            this.a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final void f(int i) {
        c cVar = this.c;
        if (cVar != null) {
            cVar.o(i);
        }
    }

    @InterfaceC5056aJ2
    public AudioManager.OnAudioFocusChangeListener g() {
        return this.b;
    }

    public float h() {
        return this.g;
    }

    public final void i(int i) {
        if (i != -3 && i != -2) {
            if (i != -1) {
                if (i != 1) {
                    I31.n(v, "Unknown focus change type: " + i);
                    return;
                }
                o(1);
                f(1);
                return;
            }
            f(-1);
            b();
        } else if (i != -2 && !r()) {
            o(3);
        } else {
            f(0);
            o(2);
        }
    }

    public void j() {
        this.c = null;
        b();
    }

    public final int k() {
        int l2;
        if (this.e == 1) {
            return 1;
        }
        if (TD2.a >= 26) {
            l2 = m();
        } else {
            l2 = l();
        }
        if (l2 == 1) {
            o(1);
            return 1;
        }
        o(0);
        return -1;
    }

    public final int l() {
        return this.a.requestAudioFocus(this.b, TD2.y0(((C9546sg) C9542sf.g(this.d)).Z), this.f);
    }

    @ES1(26)
    public final int m() {
        AudioFocusRequest.Builder a2;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest == null || this.i) {
            if (audioFocusRequest == null) {
                C4311Tg.a();
                a2 = C4114Rg.a(this.f);
            } else {
                C4311Tg.a();
                a2 = C4214Sg.a(this.h);
            }
            boolean r2 = r();
            audioAttributes = a2.setAudioAttributes(((C9546sg) C9542sf.g(this.d)).b().a);
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(r2);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(this.b);
            build = onAudioFocusChangeListener.build();
            this.h = build;
            this.i = false;
        }
        requestAudioFocus = this.a.requestAudioFocus(this.h);
        return requestAudioFocus;
    }

    public void n(@InterfaceC11300zs1 C9546sg c9546sg) {
        if (!TD2.g(this.d, c9546sg)) {
            this.d = c9546sg;
            int e = e(c9546sg);
            this.f = e;
            boolean z = true;
            if (e != 1 && e != 0) {
                z = false;
            }
            C9542sf.b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    public final void o(int i) {
        float f;
        if (this.e != i) {
            this.e = i;
            if (i == 3) {
                f = 0.2f;
            } else {
                f = 1.0f;
            }
            if (this.g != f) {
                this.g = f;
                c cVar = this.c;
                if (cVar != null) {
                    cVar.n(f);
                }
            }
        }
    }

    public final boolean p(int i) {
        if (i == 1 || this.f != 1) {
            return true;
        }
        return false;
    }

    public int q(boolean z, int i) {
        if (p(i)) {
            b();
            if (!z) {
                return -1;
            }
            return 1;
        } else if (!z) {
            return -1;
        } else {
            return k();
        }
    }

    public final boolean r() {
        C9546sg c9546sg = this.d;
        if (c9546sg != null && c9546sg.X == 1) {
            return true;
        }
        return false;
    }
}
