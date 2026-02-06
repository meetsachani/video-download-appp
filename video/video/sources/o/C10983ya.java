package o;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;

/* renamed from: o.ya  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10983ya {
    public static int a(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }

    public static int b(AudioRecord audioRecord, AudioTimestamp audioTimestamp, int i) {
        return audioRecord.getTimestamp(audioTimestamp, i);
    }
}
