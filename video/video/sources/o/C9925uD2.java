package o;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbo;
import com.google.android.gms.internal.consent_sdk.zzcs;
import java.util.Objects;
import o.C10101ux0;
import o.InterfaceC6768hK;

/* renamed from: o.uD2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9925uD2 {

    /* renamed from: o.uD2$a */
    /* loaded from: classes3.dex */
    public interface a {
        void a(@RecentlyNonNull C10101ux0 c10101ux0);
    }

    /* renamed from: o.uD2$b */
    /* loaded from: classes3.dex */
    public interface b {
        void b(@RecentlyNonNull InterfaceC6768hK interfaceC6768hK);
    }

    @RecentlyNonNull
    public static InterfaceC7011iK a(@RecentlyNonNull Context context) {
        return zza.a(context).b();
    }

    public static void b(@RecentlyNonNull final Activity activity, @RecentlyNonNull final InterfaceC6768hK.a aVar) {
        if (zza.a(activity).b().d()) {
            aVar.a(null);
            return;
        }
        zzbo c = zza.a(activity).c();
        zzcs.a();
        b bVar = new b() { // from class: com.google.android.gms.internal.consent_sdk.zzbm
            @Override // o.C9925uD2.b
            public final void b(InterfaceC6768hK interfaceC6768hK) {
                interfaceC6768hK.a(activity, aVar);
            }
        };
        Objects.requireNonNull(aVar);
        c.b(bVar, new a() { // from class: com.google.android.gms.internal.consent_sdk.zzbn
            @Override // o.C9925uD2.a
            public final void a(C10101ux0 c10101ux0) {
                InterfaceC6768hK.a.this.a(c10101ux0);
            }
        });
    }

    public static void c(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar) {
        zza.a(context).c().b(bVar, aVar);
    }

    public static void d(@RecentlyNonNull Activity activity, @RecentlyNonNull InterfaceC6768hK.a aVar) {
        zza.a(activity).c().e(activity, aVar);
    }
}
