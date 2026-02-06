package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.InterfaceC5283bF2;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC5283bF2 {
    public static final SparseIntArray A;
    public static boolean B = false;
    public static final int[] C;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 4;
    public static final int G = 8;
    public static final int H = 16;
    public static final int I = 32;
    public static final int J = 64;
    public static final int K = 128;
    public static final int L = 256;
    public static final int M = 512;
    public static final int N = 1023;
    public static final int O = 273;
    public static final int P = -1;
    public static final String b = "AudioAttributesCompat";
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 3;
    public static final int l = 4;
    public static final int m = 5;
    public static final int n = 6;

    /* renamed from: o  reason: collision with root package name */
    public static final int f48o = 7;
    public static final int p = 8;
    public static final int q = 9;
    public static final int r = 10;
    public static final int s = 11;
    public static final int t = 12;
    public static final int u = 13;
    public static final int v = 14;
    public static final int w = 15;
    public static final int x = 16;
    public static final int y = 1;
    public static final int z = 2;
    public AudioAttributesImpl a;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public static final int a = 6;
        public static final int b = 7;
        public static final int c = 9;
        public static final int d = 10;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        C = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    public static void a(boolean z2) {
        B = z2;
    }

    public static int g(boolean z2, int i2, int i3) {
        if ((i2 & 1) == 1) {
            if (z2) {
                return 1;
            }
            return 7;
        } else if ((i2 & 4) == 4) {
            if (z2) {
                return 0;
            }
            return 6;
        } else {
            switch (i3) {
                case 0:
                case 1:
                case 12:
                case 14:
                case 16:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    if (z2) {
                        return 0;
                    }
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 11:
                    return 10;
                case 13:
                    return 1;
                case 15:
                default:
                    if (!z2) {
                        return 3;
                    }
                    throw new IllegalArgumentException("Unknown usage value " + i3 + " in audio attributes");
            }
        }
    }

    public static String i(int i2) {
        switch (i2) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i2;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public static AudioAttributesCompat j(Object obj) {
        if (B) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj));
        }
        return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
    }

    public int Y() {
        return this.a.Y();
    }

    public int c() {
        return this.a.c();
    }

    public int d() {
        return this.a.d();
    }

    public int e() {
        return this.a.e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.a;
        if (audioAttributesImpl == null) {
            if (audioAttributesCompat.a != null) {
                return false;
            }
            return true;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.a);
    }

    public int f() {
        return this.a.f();
    }

    public int getContentType() {
        return this.a.getContentType();
    }

    public Object h() {
        return this.a.b();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.a = audioAttributesImpl;
    }

    /* loaded from: classes.dex */
    public static class d {
        public final AudioAttributesImpl.a a;

        public d() {
            if (AudioAttributesCompat.B) {
                this.a = new AudioAttributesImplBase.a();
            } else if (Build.VERSION.SDK_INT >= 26) {
                this.a = new AudioAttributesImplApi26.a();
            } else {
                this.a = new AudioAttributesImplApi21.a();
            }
        }

        public AudioAttributesCompat a() {
            return new AudioAttributesCompat(this.a.build());
        }

        public d b(int i) {
            this.a.c(i);
            return this;
        }

        public d c(int i) {
            this.a.i(i);
            return this;
        }

        public d d(int i) {
            this.a.b(i);
            return this;
        }

        public d e(int i) {
            this.a.a(i);
            return this;
        }

        public d(AudioAttributesCompat audioAttributesCompat) {
            if (AudioAttributesCompat.B) {
                this.a = new AudioAttributesImplBase.a(audioAttributesCompat);
            } else if (Build.VERSION.SDK_INT >= 26) {
                this.a = new AudioAttributesImplApi26.a(audioAttributesCompat.h());
            } else {
                this.a = new AudioAttributesImplApi21.a(audioAttributesCompat.h());
            }
        }
    }
}
