package o;

import android.media.EncoderProfiles;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC2426Ac0;

/* renamed from: o.Cc0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2622Cc0 {
    public static InterfaceC2426Ac0 a(EncoderProfiles encoderProfiles) {
        return InterfaceC2426Ac0.b.h(encoderProfiles.getDefaultDurationSeconds(), encoderProfiles.getRecommendedFileFormat(), b(encoderProfiles.getAudioProfiles()), c(encoderProfiles.getVideoProfiles()));
    }

    public static List<InterfaceC2426Ac0.a> b(List<EncoderProfiles.AudioProfile> list) {
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : list) {
            arrayList.add(InterfaceC2426Ac0.a.a(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        return arrayList;
    }

    public static List<InterfaceC2426Ac0.c> c(List<EncoderProfiles.VideoProfile> list) {
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : list) {
            arrayList.add(InterfaceC2426Ac0.c.a(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return arrayList;
    }
}
