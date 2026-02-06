package o;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: o.Yt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4848Yt implements NI1 {
    public static final String c = "CamcorderProfileResolutionQuirk";
    public final C10266vd2 a;
    public List<Size> b = null;

    public C4848Yt(C7641kw c7641kw) {
        this.a = c7641kw.c();
    }

    public static boolean d(C7641kw c7641kw) {
        Integer num = (Integer) c7641kw.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }

    @Override // o.NI1
    public List<Size> c() {
        List<Size> list;
        if (this.b == null) {
            Size[] b = this.a.b(34);
            if (b != null) {
                list = Arrays.asList((Size[]) b.clone());
            } else {
                list = Collections.EMPTY_LIST;
            }
            this.b = list;
            C7433k41.a(c, "mSupportedResolutions = " + this.b);
        }
        return new ArrayList(this.b);
    }
}
