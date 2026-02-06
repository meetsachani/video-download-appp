package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;

/* loaded from: classes3.dex */
public final class zzgm {
    public final zzhf a;

    public zzgm(zzmp zzmpVar) {
        this.a = zzmpVar.i0();
    }

    @InterfaceC5056aJ2
    @InterfaceC10697xN2
    public final Bundle a(String str, com.google.android.gms.internal.measurement.zzby zzbyVar) {
        this.a.l().n();
        if (zzbyVar == null) {
            this.a.j().L().a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle v0 = zzbyVar.v0(bundle);
            if (v0 == null) {
                this.a.j().G().a("Install Referrer Service returned a null response");
                return null;
            }
            return v0;
        } catch (Exception e) {
            this.a.j().G().b("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }

    @InterfaceC5056aJ2
    public final boolean b() {
        try {
            PackageManagerWrapper a = Wrappers.a(this.a.a());
            if (a == null) {
                this.a.j().K().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a.f("com.android.vending", 128).versionCode < 80837300) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            this.a.j().K().b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }
}
