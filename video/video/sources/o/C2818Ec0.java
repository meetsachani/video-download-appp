package o;

import android.media.CamcorderProfile;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC2426Ac0;

/* renamed from: o.Ec0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2818Ec0 {
    public static InterfaceC2426Ac0 a(CamcorderProfile camcorderProfile) {
        return InterfaceC2426Ac0.b.h(camcorderProfile.duration, camcorderProfile.fileFormat, b(camcorderProfile), c(camcorderProfile));
    }

    public static List<InterfaceC2426Ac0.a> b(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i = camcorderProfile.audioCodec;
        arrayList.add(InterfaceC2426Ac0.a.a(i, InterfaceC2426Ac0.g(i), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, InterfaceC2426Ac0.c(camcorderProfile.audioCodec)));
        return arrayList;
    }

    public static List<InterfaceC2426Ac0.c> c(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i = camcorderProfile.videoCodec;
        arrayList.add(InterfaceC2426Ac0.c.a(i, InterfaceC2426Ac0.d(i), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
