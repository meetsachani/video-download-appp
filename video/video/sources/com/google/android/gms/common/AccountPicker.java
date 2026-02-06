package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6181ey;

/* loaded from: classes2.dex */
public final class AccountPicker {

    /* loaded from: classes2.dex */
    public static class AccountChooserOptions {
        @InterfaceC11300zs1
        public Account a;
        public boolean b;
        @InterfaceC11300zs1
        public ArrayList c;
        @InterfaceC11300zs1
        public ArrayList d;
        public boolean e;
        @InterfaceC11300zs1
        public String f;
        @InterfaceC11300zs1
        public Bundle g;
        public boolean h;
        public int i;
        @InterfaceC11300zs1
        public String j;
        public boolean k;
        @InterfaceC11300zs1
        public zza l;
        @InterfaceC11300zs1
        public String m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f187o;

        /* loaded from: classes2.dex */
        public static class Builder {
            @InterfaceC11300zs1
            public Account a;
            @InterfaceC11300zs1
            public ArrayList b;
            @InterfaceC11300zs1
            public ArrayList c;
            public boolean d = false;
            @InterfaceC11300zs1
            public String e;
            @InterfaceC11300zs1
            public Bundle f;

            @InterfaceC5670cr1
            public AccountChooserOptions a() {
                Preconditions.b(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.b(true, "Consent is only valid for account chip styled account picker");
                AccountChooserOptions accountChooserOptions = new AccountChooserOptions();
                accountChooserOptions.d = this.c;
                accountChooserOptions.c = this.b;
                accountChooserOptions.e = this.d;
                accountChooserOptions.l = null;
                accountChooserOptions.j = null;
                accountChooserOptions.g = this.f;
                accountChooserOptions.a = this.a;
                accountChooserOptions.b = false;
                accountChooserOptions.h = false;
                accountChooserOptions.m = null;
                accountChooserOptions.i = 0;
                accountChooserOptions.f = this.e;
                accountChooserOptions.k = false;
                accountChooserOptions.n = false;
                accountChooserOptions.f187o = false;
                return accountChooserOptions;
            }

            @InterfaceC6181ey
            @InterfaceC5670cr1
            public Builder b(@InterfaceC11300zs1 List<Account> list) {
                ArrayList arrayList;
                if (list == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(list);
                }
                this.b = arrayList;
                return this;
            }

            @InterfaceC6181ey
            @InterfaceC5670cr1
            public Builder c(@InterfaceC11300zs1 List<String> list) {
                ArrayList arrayList;
                if (list == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(list);
                }
                this.c = arrayList;
                return this;
            }

            @InterfaceC6181ey
            @InterfaceC5670cr1
            public Builder d(boolean z) {
                this.d = z;
                return this;
            }

            @InterfaceC6181ey
            @InterfaceC5670cr1
            public Builder e(@InterfaceC11300zs1 Bundle bundle) {
                this.f = bundle;
                return this;
            }

            @InterfaceC6181ey
            @InterfaceC5670cr1
            public Builder f(@InterfaceC11300zs1 Account account) {
                this.a = account;
                return this;
            }

            @InterfaceC6181ey
            @InterfaceC5670cr1
            public Builder g(@InterfaceC11300zs1 String str) {
                this.e = str;
                return this;
            }
        }

        public static /* bridge */ /* synthetic */ boolean D(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.n;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean a(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.f187o;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean b(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.b;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean c(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.h;
            return false;
        }

        public static /* bridge */ /* synthetic */ boolean d(AccountChooserOptions accountChooserOptions) {
            boolean z = accountChooserOptions.k;
            return false;
        }

        public static /* bridge */ /* synthetic */ int e(AccountChooserOptions accountChooserOptions) {
            int i = accountChooserOptions.i;
            return 0;
        }

        public static /* bridge */ /* synthetic */ zza h(AccountChooserOptions accountChooserOptions) {
            zza zzaVar = accountChooserOptions.l;
            return null;
        }

        public static /* bridge */ /* synthetic */ String i(AccountChooserOptions accountChooserOptions) {
            String str = accountChooserOptions.j;
            return null;
        }

        public static /* bridge */ /* synthetic */ String j(AccountChooserOptions accountChooserOptions) {
            String str = accountChooserOptions.m;
            return null;
        }
    }

    private AccountPicker() {
    }

    @ResultIgnorabilityUnspecified
    @InterfaceC5670cr1
    @Deprecated
    public static Intent a(@InterfaceC11300zs1 Account account, @InterfaceC11300zs1 ArrayList<Account> arrayList, @InterfaceC11300zs1 String[] strArr, boolean z, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String[] strArr2, @InterfaceC11300zs1 Bundle bundle) {
        Intent intent = new Intent();
        Preconditions.b(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @InterfaceC5670cr1
    public static Intent b(@InterfaceC5670cr1 AccountChooserOptions accountChooserOptions) {
        Intent intent = new Intent();
        AccountChooserOptions.d(accountChooserOptions);
        AccountChooserOptions.i(accountChooserOptions);
        Preconditions.b(true, "We only support hostedDomain filter for account chip styled account picker");
        AccountChooserOptions.h(accountChooserOptions);
        Preconditions.b(true, "Consent is only valid for account chip styled account picker");
        AccountChooserOptions.b(accountChooserOptions);
        Preconditions.b(true, "Making the selected account non-clickable is only supported for the THEME_DAY_NIGHT_GOOGLE_MATERIAL2, THEME_LIGHT_GOOGLE_MATERIAL3, THEME_DARK_GOOGLE_MATERIAL3 or THEME_DAY_NIGHT_GOOGLE_MATERIAL3 themes");
        AccountChooserOptions.d(accountChooserOptions);
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", accountChooserOptions.c);
        if (accountChooserOptions.d != null) {
            intent.putExtra("allowableAccountTypes", (String[]) accountChooserOptions.d.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", accountChooserOptions.g);
        intent.putExtra("selectedAccount", accountChooserOptions.a);
        AccountChooserOptions.b(accountChooserOptions);
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", accountChooserOptions.e);
        intent.putExtra("descriptionTextOverride", accountChooserOptions.f);
        AccountChooserOptions.c(accountChooserOptions);
        intent.putExtra("setGmsCoreAccount", false);
        AccountChooserOptions.j(accountChooserOptions);
        intent.putExtra("realClientPackage", (String) null);
        AccountChooserOptions.e(accountChooserOptions);
        intent.putExtra("overrideTheme", 0);
        AccountChooserOptions.d(accountChooserOptions);
        intent.putExtra("overrideCustomTheme", 0);
        AccountChooserOptions.i(accountChooserOptions);
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        AccountChooserOptions.d(accountChooserOptions);
        AccountChooserOptions.h(accountChooserOptions);
        AccountChooserOptions.D(accountChooserOptions);
        AccountChooserOptions.a(accountChooserOptions);
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
