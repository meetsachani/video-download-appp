package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import o.YE2;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(YE2 ye2) {
        return androidx.media.AudioAttributesCompatParcelizer.read(ye2);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, YE2 ye2) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, ye2);
    }
}
