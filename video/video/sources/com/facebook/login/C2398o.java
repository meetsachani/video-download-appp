package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C0376a;
import com.facebook.EnumC2354h;
import com.facebook.login.w;
import com.google.firebase.crashlytics.internal.metadata.MetaDataStore;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import o.ActivityC4864Yy0;
import o.C6562gT0;
import o.C9516sY;
import o.C9998uW1;
import o.HT1;
import o.InterfaceC7058iW0;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HT1({HT1.a.Y})
/* renamed from: com.facebook.login.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2398o extends I {
    public static ScheduledThreadPoolExecutor d1;
    @NotNull
    public final String b1;
    @NotNull
    public static final b c1 = new b(null);
    @InterfaceC7058iW0
    @NotNull
    public static final Parcelable.Creator<C2398o> CREATOR = new a();

    /* renamed from: com.facebook.login.o$a */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<C2398o> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: a */
        public C2398o createFromParcel(@NotNull Parcel parcel) {
            C6562gT0.p(parcel, "source");
            return new C2398o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* renamed from: b */
        public C2398o[] newArray(int i) {
            return new C2398o[i];
        }
    }

    /* renamed from: com.facebook.login.o$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final synchronized ScheduledThreadPoolExecutor a() {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
            try {
                if (C2398o.d1 == null) {
                    C2398o.d1 = new ScheduledThreadPoolExecutor(1);
                }
                scheduledThreadPoolExecutor = C2398o.d1;
                if (scheduledThreadPoolExecutor == null) {
                    C6562gT0.S("backgroundExecutor");
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
            return scheduledThreadPoolExecutor;
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2398o(@NotNull w wVar) {
        super(wVar);
        C6562gT0.p(wVar, A.s2);
        this.b1 = "device_auth";
    }

    @InterfaceC9511sW0
    @NotNull
    public static final synchronized ScheduledThreadPoolExecutor D() {
        ScheduledThreadPoolExecutor a2;
        synchronized (C2398o.class) {
            a2 = c1.a();
        }
        return a2;
    }

    @NotNull
    public C2397n C() {
        return new C2397n();
    }

    public void E() {
        h().h(w.f.d1.a(h().C(), I.Y0));
    }

    public void I(@NotNull Exception exc) {
        C6562gT0.p(exc, "ex");
        h().h(w.f.c.e(w.f.d1, h().C(), null, exc.getMessage(), null, 8, null));
    }

    public void J(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable EnumC2354h enumC2354h, @Nullable Date date, @Nullable Date date2, @Nullable Date date3) {
        C6562gT0.p(str, C9998uW1.m);
        C6562gT0.p(str2, "applicationId");
        C6562gT0.p(str3, MetaDataStore.c);
        h().h(w.f.d1.f(h().C(), new C0376a(str, str2, str3, collection, collection2, collection3, enumC2354h, date, date2, date3, null, 1024, null)));
    }

    public final void K(w.e eVar) {
        ActivityC4864Yy0 m = h().m();
        if (m != null && !m.isFinishing()) {
            C2397n C = C();
            C.c3(m.W0(), "login_with_facebook");
            C.I3(eVar);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.I
    @NotNull
    public String m() {
        return this.b1;
    }

    @Override // com.facebook.login.I
    public int z(@NotNull w.e eVar) {
        C6562gT0.p(eVar, "request");
        K(eVar);
        return 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2398o(@NotNull Parcel parcel) {
        super(parcel);
        C6562gT0.p(parcel, "parcel");
        this.b1 = "device_auth";
    }
}
