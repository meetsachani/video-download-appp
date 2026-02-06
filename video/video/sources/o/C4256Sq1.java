package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1583:1\n275#2,6:1584\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n*L\n1510#1:1584,6\n*E\n"})
/* renamed from: o.Sq1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4256Sq1 extends C8419o31 implements InterfaceC5563cP0 {
    @NotNull
    public final String F(@NotNull String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object l = l();
        C6562gT0.n(l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        boolean z = true;
        for (C8906q31 c8906q31 = (C8906q31) l; !C6562gT0.g(c8906q31, this); c8906q31 = c8906q31.m()) {
            if (c8906q31 instanceof AbstractC6569gV0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(C6566gU0.h);
                }
                sb.append(c8906q31);
            }
        }
        sb.append(C6566gU0.g);
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "toString(...)");
        return sb2;
    }

    @Override // o.InterfaceC5563cP0
    public boolean h() {
        return true;
    }

    @Override // o.C8906q31
    @NotNull
    public String toString() {
        return super.toString();
    }

    @Override // o.InterfaceC5563cP0
    @NotNull
    public C4256Sq1 a() {
        return this;
    }
}
