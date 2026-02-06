package o;

import com.google.firebase.messaging.GmsRpc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1620#2,3:244\n1620#2,3:247\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n166#1:244,3\n174#1:247,3\n*E\n"})
/* renamed from: o.ay0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5212ay0 extends AbstractC2576Bp0 {
    @NotNull
    public final AbstractC2576Bp0 e;

    /* renamed from: o.ay0$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC8052mY0 implements HA0<C4972Zy1, C4972Zy1> {
        public a() {
            super(1);
        }

        @Override // o.HA0
        @NotNull
        /* renamed from: c */
        public final C4972Zy1 invoke(@NotNull C4972Zy1 c4972Zy1) {
            C6562gT0.p(c4972Zy1, "it");
            return AbstractC5212ay0.this.P(c4972Zy1, "listRecursively");
        }
    }

    public AbstractC5212ay0(@NotNull AbstractC2576Bp0 abstractC2576Bp0) {
        C6562gT0.p(abstractC2576Bp0, "delegate");
        this.e = abstractC2576Bp0;
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public B02<C4972Zy1> B(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        C6562gT0.p(c4972Zy1, "dir");
        return C6695h12.L1(this.e.B(O(c4972Zy1, "listRecursively", "dir"), z), new a());
    }

    @Override // o.AbstractC2576Bp0
    @Nullable
    public C9340rp0 E(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(c4972Zy1, "path");
        C9340rp0 E = this.e.E(O(c4972Zy1, "metadataOrNull", "path"));
        if (E == null) {
            return null;
        }
        if (E.i() == null) {
            return E;
        }
        return C9340rp0.b(E, false, false, P(E.i(), "metadataOrNull"), null, null, null, null, null, C10997yd1.w1, null);
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public AbstractC8848pp0 F(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(c4972Zy1, "file");
        return this.e.F(O(c4972Zy1, "openReadOnly", "file"));
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public AbstractC8848pp0 H(@NotNull C4972Zy1 c4972Zy1, boolean z, boolean z2) throws IOException {
        C6562gT0.p(c4972Zy1, "file");
        return this.e.H(O(c4972Zy1, "openReadWrite", "file"), z, z2);
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public J82 K(@NotNull C4972Zy1 c4972Zy1, boolean z) throws IOException {
        C6562gT0.p(c4972Zy1, "file");
        return this.e.K(O(c4972Zy1, "sink", "file"), z);
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public InterfaceC7072ia2 M(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(c4972Zy1, "file");
        return this.e.M(O(c4972Zy1, "source", "file"));
    }

    @InterfaceC8046mW0(name = "delegate")
    @NotNull
    public final AbstractC2576Bp0 N() {
        return this.e;
    }

    @NotNull
    public C4972Zy1 O(@NotNull C4972Zy1 c4972Zy1, @NotNull String str, @NotNull String str2) {
        C6562gT0.p(c4972Zy1, "path");
        C6562gT0.p(str, "functionName");
        C6562gT0.p(str2, "parameterName");
        return c4972Zy1;
    }

    @NotNull
    public C4972Zy1 P(@NotNull C4972Zy1 c4972Zy1, @NotNull String str) {
        C6562gT0.p(c4972Zy1, "path");
        C6562gT0.p(str, "functionName");
        return c4972Zy1;
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public J82 e(@NotNull C4972Zy1 c4972Zy1, boolean z) throws IOException {
        C6562gT0.p(c4972Zy1, "file");
        return this.e.e(O(c4972Zy1, "appendingSink", "file"), z);
    }

    @Override // o.AbstractC2576Bp0
    public void g(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) throws IOException {
        C6562gT0.p(c4972Zy1, "source");
        C6562gT0.p(c4972Zy12, "target");
        this.e.g(O(c4972Zy1, "atomicMove", "source"), O(c4972Zy12, "atomicMove", "target"));
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public C4972Zy1 h(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(c4972Zy1, "path");
        return P(this.e.h(O(c4972Zy1, "canonicalize", "path")), "canonicalize");
    }

    @Override // o.AbstractC2576Bp0
    public void n(@NotNull C4972Zy1 c4972Zy1, boolean z) throws IOException {
        C6562gT0.p(c4972Zy1, "dir");
        this.e.n(O(c4972Zy1, "createDirectory", "dir"), z);
    }

    @Override // o.AbstractC2576Bp0
    public void p(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) throws IOException {
        C6562gT0.p(c4972Zy1, "source");
        C6562gT0.p(c4972Zy12, "target");
        this.e.p(O(c4972Zy1, "createSymlink", "source"), O(c4972Zy12, "createSymlink", "target"));
    }

    @Override // o.AbstractC2576Bp0
    public void r(@NotNull C4972Zy1 c4972Zy1, boolean z) throws IOException {
        C6562gT0.p(c4972Zy1, "path");
        this.e.r(O(c4972Zy1, GmsRpc.u, "path"), z);
    }

    @NotNull
    public String toString() {
        return C6551gQ1.d(getClass()).V() + '(' + this.e + ')';
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public List<C4972Zy1> y(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(c4972Zy1, "dir");
        C4972Zy1 O = O(c4972Zy1, "list", "dir");
        ArrayList arrayList = new ArrayList();
        for (C4972Zy1 c4972Zy12 : this.e.y(O)) {
            arrayList.add(P(c4972Zy12, "list"));
        }
        C9201rF.m0(arrayList);
        return arrayList;
    }

    @Override // o.AbstractC2576Bp0
    @Nullable
    public List<C4972Zy1> z(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "dir");
        List<C4972Zy1> z = this.e.z(O(c4972Zy1, "listOrNull", "dir"));
        if (z == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C4972Zy1 c4972Zy12 : z) {
            arrayList.add(P(c4972Zy12, "listOrNull"));
        }
        C9201rF.m0(arrayList);
        return arrayList;
    }
}
