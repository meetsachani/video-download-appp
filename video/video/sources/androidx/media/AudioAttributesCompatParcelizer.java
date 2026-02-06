package androidx.media;

import o.YE2;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(YE2 ye2) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl) ye2.h0(audioAttributesCompat.a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, YE2 ye2) {
        ye2.j0(false, false);
        ye2.m1(audioAttributesCompat.a, 1);
    }
}
