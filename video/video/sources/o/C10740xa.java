package o;

import android.media.AudioFormat;
import android.media.AudioRecord;

/* renamed from: o.xa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10740xa {
    public static AudioRecord a(AudioRecord.Builder builder) {
        return builder.build();
    }

    public static AudioRecord.Builder b() {
        return new AudioRecord.Builder();
    }

    public static void c(AudioRecord.Builder builder, AudioFormat audioFormat) {
        builder.setAudioFormat(audioFormat);
    }

    public static void d(AudioRecord.Builder builder, int i) {
        builder.setAudioSource(i);
    }

    public static void e(AudioRecord.Builder builder, int i) {
        builder.setBufferSizeInBytes(i);
    }
}
