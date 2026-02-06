package androidx.media;

import android.media.AudioAttributes;
import o.YE2;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(YE2 ye2) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) ye2.W(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = ye2.M(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, YE2 ye2) {
        ye2.j0(false, false);
        ye2.X0(audioAttributesImplApi26.a, 1);
        ye2.M0(audioAttributesImplApi26.b, 2);
    }
}
