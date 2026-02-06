package o;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;

/* loaded from: classes.dex */
public class O7 implements InterfaceC10688xL1 {
    public final Range<Integer> a;

    public O7(C7641kw c7641kw) {
        this.a = g((Range[]) c7641kw.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    public static boolean f(C7641kw c7641kw) {
        Integer num = (Integer) c7641kw.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null && num.intValue() == 2) {
            return true;
        }
        return false;
    }

    public final Range<Integer> d(Range<Integer> range) {
        int intValue = range.getUpper().intValue();
        int intValue2 = range.getLower().intValue();
        if (range.getUpper().intValue() >= 1000) {
            intValue = range.getUpper().intValue() / 1000;
        }
        if (range.getLower().intValue() >= 1000) {
            intValue2 = range.getLower().intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    public Range<Integer> e() {
        return this.a;
    }

    public final Range<Integer> g(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> d = d(range2);
                if (d.getUpper().intValue() == 30 && (range == null || d.getLower().intValue() < range.getLower().intValue())) {
                    range = d;
                }
            }
        }
        return range;
    }
}
