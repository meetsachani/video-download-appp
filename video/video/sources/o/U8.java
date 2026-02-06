package o;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public class U8 implements InterfaceC4218Sh {
    public final AccountManager a;
    public final Account b;
    public final String c;
    public final boolean d;

    public U8(Context context, Account account, String str) {
        this(context, account, str, false);
    }

    @Override // o.InterfaceC4218Sh
    public void a(String str) {
        this.a.invalidateAuthToken(this.b.type, str);
    }

    @Override // o.InterfaceC4218Sh
    public String b() throws C4118Rh {
        String str;
        AccountManagerFuture<Bundle> authToken = this.a.getAuthToken(this.b, this.c, this.d, null, null);
        try {
            Bundle result = authToken.getResult();
            if (authToken.isDone() && !authToken.isCancelled()) {
                if (!result.containsKey(C9998uW1.R)) {
                    str = result.getString("authtoken");
                } else {
                    throw new C4118Rh((Intent) result.getParcelable(C9998uW1.R));
                }
            } else {
                str = null;
            }
            if (str != null) {
                return str;
            }
            throw new C4118Rh("Got null auth token for type: " + this.c);
        } catch (Exception e) {
            throw new C4118Rh("Error while retrieving auth token", e);
        }
    }

    public Account c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public U8(Context context, Account account, String str, boolean z) {
        this(AccountManager.get(context), account, str, z);
    }

    public U8(AccountManager accountManager, Account account, String str, boolean z) {
        this.a = accountManager;
        this.b = account;
        this.c = str;
        this.d = z;
    }
}
