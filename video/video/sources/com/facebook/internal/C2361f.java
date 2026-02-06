package com.facebook.internal;

import android.content.Intent;
import com.facebook.InterfaceC2407p;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.internal.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2361f implements InterfaceC2407p {
    @NotNull
    public static final b b = new b(null);
    @NotNull
    public static final Map<Integer, a> c = new HashMap();
    @NotNull
    public final Map<Integer, a> a = new HashMap();

    /* renamed from: com.facebook.internal.f$a */
    /* loaded from: classes2.dex */
    public interface a {
        boolean a(int i, @Nullable Intent intent);
    }

    /* renamed from: com.facebook.internal.f$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final synchronized a b(int i) {
            return (a) C2361f.c.get(Integer.valueOf(i));
        }

        @InterfaceC9511sW0
        public final synchronized void c(int i, @NotNull a aVar) {
            C6562gT0.p(aVar, "callback");
            if (C2361f.c.containsKey(Integer.valueOf(i))) {
                return;
            }
            C2361f.c.put(Integer.valueOf(i), aVar);
        }

        @InterfaceC9511sW0
        public final boolean d(int i, int i2, Intent intent) {
            a b = b(i);
            if (b == null) {
                return false;
            }
            return b.a(i2, intent);
        }

        public b() {
        }
    }

    /* renamed from: com.facebook.internal.f$c */
    /* loaded from: classes2.dex */
    public enum c {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);
        
        public final int X;

        c(int i) {
            this.X = i;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final int g() {
            com.facebook.M m = com.facebook.M.a;
            return com.facebook.M.u() + this.X;
        }
    }

    @InterfaceC9511sW0
    public static final synchronized void c(int i, @NotNull a aVar) {
        synchronized (C2361f.class) {
            b.c(i, aVar);
        }
    }

    public final void b(int i, @NotNull a aVar) {
        C6562gT0.p(aVar, "callback");
        this.a.put(Integer.valueOf(i), aVar);
    }

    public final void d(int i) {
        this.a.remove(Integer.valueOf(i));
    }

    @Override // com.facebook.InterfaceC2407p
    public boolean onActivityResult(int i, int i2, @Nullable Intent intent) {
        a aVar = this.a.get(Integer.valueOf(i));
        if (aVar == null) {
            return b.d(i, i2, intent);
        }
        return aVar.a(i2, intent);
    }
}
