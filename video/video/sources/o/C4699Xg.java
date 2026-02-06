package o;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;

/* renamed from: o.Xg  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4699Xg {
    public static final String a = "AudioManCompat";
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;

    /* renamed from: o.Xg$a */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(AudioManager audioManager) {
            return audioManager.isVolumeFixed();
        }
    }

    /* renamed from: o.Xg$b */
    /* loaded from: classes.dex */
    public static class b {
        public static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        public static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    /* renamed from: o.Xg$c */
    /* loaded from: classes.dex */
    public static class c {
        public static int a(AudioManager audioManager, int i) {
            return audioManager.getStreamMinVolume(i);
        }
    }

    public static int a(AudioManager audioManager, androidx.media.a aVar) {
        if (audioManager != null) {
            if (aVar != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return b.a(audioManager, aVar.c());
                }
                return audioManager.abandonAudioFocus(aVar.f());
            }
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        throw new IllegalArgumentException("AudioManager must not be null");
    }

    public static int b(AudioManager audioManager, int i) {
        return audioManager.getStreamMaxVolume(i);
    }

    public static int c(AudioManager audioManager, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(audioManager, i);
        }
        return 0;
    }

    public static boolean d(AudioManager audioManager) {
        return a.a(audioManager);
    }

    public static int e(AudioManager audioManager, androidx.media.a aVar) {
        if (audioManager != null) {
            if (aVar != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return b.b(audioManager, aVar.c());
                }
                return audioManager.requestAudioFocus(aVar.f(), aVar.b().f(), aVar.e());
            }
            throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        throw new IllegalArgumentException("AudioManager must not be null");
    }
}
