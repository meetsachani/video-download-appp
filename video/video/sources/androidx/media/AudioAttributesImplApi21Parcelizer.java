package androidx.media;

import android.media.AudioAttributes;
import o.YE2;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(YE2 ye2) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) ye2.W(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = ye2.M(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, YE2 ye2) {
        ye2.j0(false, false);
        ye2.X0(audioAttributesImplApi21.a, 1);
        ye2.M0(audioAttributesImplApi21.b, 2);
    }
}
