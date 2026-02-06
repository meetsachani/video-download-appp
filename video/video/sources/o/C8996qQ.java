package o;

import o.InterfaceC5809dQ;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HK1
@IgnoreJRERequirement
/* renamed from: o.qQ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8996qQ extends AbstractC9627t0 implements InterfaceC9577sn2<String> {
    @NotNull
    public static final a Z = new a(null);
    public final long Y;

    /* renamed from: o.qQ$a */
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC5809dQ.c<C8996qQ> {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C8996qQ(long j) {
        super(Z);
        this.Y = j;
    }

    public static /* synthetic */ C8996qQ U(C8996qQ c8996qQ, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c8996qQ.Y;
        }
        return c8996qQ.R(j);
    }

    public final long I() {
        return this.Y;
    }

    @NotNull
    public final C8996qQ R(long j) {
        return new C8996qQ(j);
    }

    public final long V() {
        return this.Y;
    }

    @Override // o.InterfaceC9577sn2
    /* renamed from: W */
    public void G(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull String str) {
        Thread.currentThread().setName(str);
    }

    @Override // o.InterfaceC9577sn2
    @NotNull
    /* renamed from: Z */
    public String c0(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        C9245rQ c9245rQ = (C9245rQ) interfaceC5809dQ.f(C9245rQ.Z);
        String str = (c9245rQ == null || (str = c9245rQ.V()) == null) ? "coroutine" : "coroutine";
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int Y3 = C10763xf2.Y3(name, C7035iQ.a, 0, false, 6, null);
        if (Y3 < 0) {
            Y3 = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + Y3 + 10);
        String substring = name.substring(0, Y3);
        C6562gT0.o(substring, "substring(...)");
        sb.append(substring);
        sb.append(C7035iQ.a);
        sb.append(str);
        sb.append('#');
        sb.append(this.Y);
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "toString(...)");
        currentThread.setName(sb2);
        return name;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C8996qQ) && this.Y == ((C8996qQ) obj).Y) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.Y);
    }

    @NotNull
    public String toString() {
        return "CoroutineId(" + this.Y + ')';
    }
}
