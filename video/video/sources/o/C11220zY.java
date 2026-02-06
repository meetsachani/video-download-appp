package o;

import android.content.Context;
import o.C8541oZ;
import o.FU;

@Deprecated
/* renamed from: o.zY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11220zY implements FU.a {
    public final Context a;
    @InterfaceC11300zs1
    public final InterfaceC4261Sr2 b;
    public final FU.a c;

    public C11220zY(Context context) {
        this(context, (String) null, (InterfaceC4261Sr2) null);
    }

    @Override // o.FU.a
    /* renamed from: c */
    public C10977yY a() {
        C10977yY c10977yY = new C10977yY(this.a, this.c.a());
        InterfaceC4261Sr2 interfaceC4261Sr2 = this.b;
        if (interfaceC4261Sr2 != null) {
            c10977yY.s(interfaceC4261Sr2);
        }
        return c10977yY;
    }

    public C11220zY(Context context, @InterfaceC11300zs1 String str) {
        this(context, str, (InterfaceC4261Sr2) null);
    }

    public C11220zY(Context context, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        this(context, interfaceC4261Sr2, new C8541oZ.b().k(str));
    }

    public C11220zY(Context context, FU.a aVar) {
        this(context, (InterfaceC4261Sr2) null, aVar);
    }

    public C11220zY(Context context, @InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2, FU.a aVar) {
        this.a = context.getApplicationContext();
        this.b = interfaceC4261Sr2;
        this.c = aVar;
    }
}
