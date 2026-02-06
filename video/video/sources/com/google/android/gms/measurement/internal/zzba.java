package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import com.google.android.gms.common.internal.AccountType;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.C10201vM;
import o.InterfaceC10697xN2;
import o.JK1;

/* loaded from: classes3.dex */
public final class zzba extends zzic {
    public long c;
    public String d;
    public AccountManager e;
    public Boolean f;
    public long g;

    public zzba(zzhf zzhfVar) {
        super(zzhfVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzaf d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzba e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzae f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzfq g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzgd h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zznd i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzfr j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzgy l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.zzic
    public final boolean s() {
        Calendar calendar = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.d = lowerCase + "-" + lowerCase2;
        return false;
    }

    @InterfaceC10697xN2
    public final long u() {
        n();
        return this.g;
    }

    public final long v() {
        o();
        return this.c;
    }

    public final String w() {
        o();
        return this.d;
    }

    @InterfaceC10697xN2
    public final void x() {
        n();
        this.f = null;
        this.g = 0L;
    }

    @InterfaceC10697xN2
    public final boolean y() {
        Account[] result;
        n();
        long a = b().a();
        if (a - this.g > 86400000) {
            this.f = null;
        }
        Boolean bool = this.f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C10201vM.a(a(), "android.permission.GET_ACCOUNTS") != 0) {
            j().N().a("Permission error checking for dasher/unicorn accounts");
            this.g = a;
            this.f = Boolean.FALSE;
            return false;
        }
        if (this.e == null) {
            this.e = AccountManager.get(a());
        }
        try {
            result = this.e.getAccountsByTypeAndFeatures(AccountType.a, new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException e) {
            e = e;
            j().I().b("Exception checking account types", e);
            this.g = a;
            this.f = Boolean.FALSE;
            return false;
        } catch (OperationCanceledException e2) {
            e = e2;
            j().I().b("Exception checking account types", e);
            this.g = a;
            this.f = Boolean.FALSE;
            return false;
        } catch (IOException e3) {
            e = e3;
            j().I().b("Exception checking account types", e);
            this.g = a;
            this.f = Boolean.FALSE;
            return false;
        }
        if (result != null && result.length > 0) {
            this.f = Boolean.TRUE;
            this.g = a;
            return true;
        }
        Account[] result2 = this.e.getAccountsByTypeAndFeatures(AccountType.a, new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.f = Boolean.TRUE;
            this.g = a;
            return true;
        }
        this.g = a;
        this.f = Boolean.FALSE;
        return false;
    }
}
