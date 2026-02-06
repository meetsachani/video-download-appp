package androidx.media;

import o.YE2;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(YE2 ye2) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = ye2.M(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = ye2.M(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = ye2.M(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = ye2.M(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, YE2 ye2) {
        ye2.j0(false, false);
        ye2.M0(audioAttributesImplBase.a, 1);
        ye2.M0(audioAttributesImplBase.b, 2);
        ye2.M0(audioAttributesImplBase.c, 3);
        ye2.M0(audioAttributesImplBase.d, 4);
    }
}
