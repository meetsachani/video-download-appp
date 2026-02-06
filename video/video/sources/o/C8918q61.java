package o;

import android.os.Build;
import java.util.HashSet;

/* renamed from: o.q61  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8918q61 {
    public final HashSet<EnumC8675p61> a = new HashSet<>();

    public boolean a(EnumC8675p61 enumC8675p61, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT < enumC8675p61.X) {
                C7190j41.e(String.format("%s is not supported pre SDK %d", enumC8675p61.name(), Integer.valueOf(enumC8675p61.X)));
                return false;
            }
            return this.a.add(enumC8675p61);
        }
        return this.a.remove(enumC8675p61);
    }

    public boolean b(EnumC8675p61 enumC8675p61) {
        return this.a.contains(enumC8675p61);
    }
}
