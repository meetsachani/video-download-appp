package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImplApi21;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    /* loaded from: classes.dex */
    public static class a extends AudioAttributesImplApi21.a {
        public a() {
        }

        @Override // androidx.media.AudioAttributesImplApi21.a, androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.a.build());
        }

        @Override // androidx.media.AudioAttributesImplApi21.a
        /* renamed from: h */
        public a g(int i) {
            this.a.setUsage(i);
            return this;
        }

        public a(Object obj) {
            super(obj);
        }
    }

    public AudioAttributesImplApi26() {
    }

    @Override // androidx.media.AudioAttributesImplApi21, androidx.media.AudioAttributesImpl
    public int e() {
        int volumeControlStream;
        volumeControlStream = this.a.getVolumeControlStream();
        return volumeControlStream;
    }

    public AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
