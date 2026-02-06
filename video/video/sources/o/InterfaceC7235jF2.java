package o;

import android.util.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.jF2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC7235jF2 {
    public static final InterfaceC7235jF2 a = new a();

    /* renamed from: o.jF2$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC7235jF2 {
        @Override // o.InterfaceC7235jF2
        public Set<N80> a() {
            return new HashSet();
        }

        @Override // o.InterfaceC7235jF2
        public List<C5548cL1> b(N80 n80) {
            return new ArrayList();
        }

        @Override // o.InterfaceC7235jF2
        public boolean c(C5548cL1 c5548cL1, N80 n80) {
            return false;
        }
    }

    Set<N80> a();

    List<C5548cL1> b(N80 n80);

    boolean c(C5548cL1 c5548cL1, N80 n80);

    default VG2 d(C5548cL1 c5548cL1, N80 n80) {
        return null;
    }

    default VG2 e(Size size, N80 n80) {
        return null;
    }

    default C5548cL1 f(Size size, N80 n80) {
        return C5548cL1.g;
    }
}
