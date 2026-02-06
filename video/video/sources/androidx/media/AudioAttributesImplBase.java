package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int a;
    public int b;
    public int c;
    public int d;

    public AudioAttributesImplBase() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 9:
            default:
                return 0;
            case 10:
                return 11;
        }
    }

    @Override // androidx.media.AudioAttributesImpl
    public int Y() {
        int i = this.c;
        int f = f();
        if (f == 6) {
            i |= 4;
        } else if (f == 7) {
            i |= 1;
        }
        return i & AudioAttributesCompat.O;
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object b() {
        return null;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int c() {
        return this.d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int d() {
        return this.a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int e() {
        return AudioAttributesCompat.g(true, this.c, this.a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.b != audioAttributesImplBase.getContentType() || this.c != audioAttributesImplBase.Y() || this.a != audioAttributesImplBase.d() || this.d != audioAttributesImplBase.d) {
            return false;
        }
        return true;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int f() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.g(false, this.c, this.a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.d != -1) {
            sb.append(" stream=");
            sb.append(this.d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.i(this.a));
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.c).toUpperCase());
        return sb.toString();
    }

    /* loaded from: classes.dex */
    public static class a implements AudioAttributesImpl.a {
        public int a;
        public int b;
        public int c;
        public int d;

        public a() {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = -1;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.b, this.c, this.a, this.d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: d */
        public a c(int i) {
            if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4) {
                this.b = 0;
                return this;
            }
            this.b = i;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: e */
        public a i(int i) {
            this.c = (i & 1023) | this.c;
            return this;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final a f(int i) {
            switch (i) {
                case 0:
                    this.b = 1;
                    break;
                case 1:
                    this.b = 4;
                    break;
                case 2:
                    this.b = 4;
                    break;
                case 3:
                    this.b = 2;
                    break;
                case 4:
                    this.b = 4;
                    break;
                case 5:
                    this.b = 4;
                    break;
                case 6:
                    this.b = 1;
                    this.c |= 4;
                    break;
                case 7:
                    this.c = 1 | this.c;
                    this.b = 4;
                    break;
                case 8:
                    this.b = 4;
                    break;
                case 9:
                    this.b = 4;
                    break;
                case 10:
                    this.b = 1;
                    break;
                default:
                    Log.e(AudioAttributesCompat.b, "Invalid stream type " + i + " for AudioAttributesCompat");
                    break;
            }
            this.a = AudioAttributesImplBase.a(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: g */
        public a b(int i) {
            if (i != 10) {
                this.d = i;
                return f(i);
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: h */
        public a a(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.a = i;
                    return this;
                case 16:
                    this.a = 12;
                    return this;
                default:
                    this.a = 0;
                    return this;
            }
        }

        public a(AudioAttributesCompat audioAttributesCompat) {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.d = -1;
            this.a = audioAttributesCompat.d();
            this.b = audioAttributesCompat.getContentType();
            this.c = audioAttributesCompat.Y();
            this.d = audioAttributesCompat.c();
        }
    }

    public AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.a = i3;
        this.d = i4;
    }
}
