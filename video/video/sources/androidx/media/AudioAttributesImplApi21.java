package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {
    public AudioAttributes a;
    public int b;

    public AudioAttributesImplApi21() {
        this.b = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int Y() {
        return this.a.getFlags();
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object b() {
        return this.a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int c() {
        return this.b;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int d() {
        return this.a.getUsage();
    }

    @Override // androidx.media.AudioAttributesImpl
    public int e() {
        return AudioAttributesCompat.g(true, Y(), d());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.a.equals(((AudioAttributesImplApi21) obj).a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int f() {
        int i = this.b;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.g(false, Y(), d());
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.a.getContentType();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }

    /* loaded from: classes.dex */
    public static class a implements AudioAttributesImpl.a {
        public final AudioAttributes.Builder a;

        public a() {
            this.a = new AudioAttributes.Builder();
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.a.build());
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: d */
        public a c(int i) {
            this.a.setContentType(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: e */
        public a i(int i) {
            this.a.setFlags(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: f */
        public a b(int i) {
            this.a.setLegacyStreamType(i);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: g */
        public a a(int i) {
            if (i == 16) {
                i = 12;
            }
            this.a.setUsage(i);
            return this;
        }

        public a(Object obj) {
            this.a = new AudioAttributes.Builder((AudioAttributes) obj);
        }
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.a = audioAttributes;
        this.b = i;
    }
}
