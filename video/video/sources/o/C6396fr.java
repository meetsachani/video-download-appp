package o;

import android.annotation.TargetApi;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import o.InterfaceC2493At;
import o.InterfaceC7750lN;

/* renamed from: o.fr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6396fr {

    @TargetApi(24)
    /* renamed from: o.fr$a */
    /* loaded from: classes4.dex */
    public static final class a extends C6396fr {
        @Override // o.C6396fr
        public List<? extends InterfaceC2493At.a> a(@InterfaceC10571ws1 Executor executor) {
            return Arrays.asList(new KH(), new C8051mY(executor));
        }

        @Override // o.C6396fr
        public List<? extends InterfaceC7750lN.a> b() {
            return Collections.singletonList(new C4759Xv1());
        }
    }

    public List<? extends InterfaceC2493At.a> a(@InterfaceC10571ws1 Executor executor) {
        return Collections.singletonList(new C8051mY(executor));
    }

    public List<? extends InterfaceC7750lN.a> b() {
        return Collections.EMPTY_LIST;
    }
}
