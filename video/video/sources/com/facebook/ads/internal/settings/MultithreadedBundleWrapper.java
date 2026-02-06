package com.facebook.ads.internal.settings;

import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import o.InterfaceC11300zs1;
import o.InterfaceC2992Fs1;

@InterfaceC2992Fs1(InterfaceC2992Fs1.a.X)
@Keep
/* loaded from: classes2.dex */
public class MultithreadedBundleWrapper {
    private final Bundle mBundle = new Bundle();

    public synchronized boolean getBoolean(String str) {
        return this.mBundle.getBoolean(str);
    }

    @InterfaceC11300zs1
    public synchronized Integer getInteger(String str) {
        Integer num;
        if (this.mBundle.containsKey(str)) {
            num = Integer.valueOf(this.mBundle.getInt(str));
        } else {
            num = null;
        }
        return num;
    }

    @InterfaceC11300zs1
    public synchronized Serializable getSerializable(String str) {
        return this.mBundle.getSerializable(str);
    }

    @InterfaceC11300zs1
    public synchronized String getString(String str, @InterfaceC11300zs1 String str2) {
        return this.mBundle.getString(str, str2);
    }

    @InterfaceC11300zs1
    public synchronized String[] getStringArray(String str) {
        return this.mBundle.getStringArray(str);
    }

    @InterfaceC11300zs1
    public synchronized ArrayList<String> getStringArrayList(String str) {
        return this.mBundle.getStringArrayList(str);
    }

    public synchronized void putBoolean(String str, boolean z) {
        this.mBundle.putBoolean(str, z);
    }

    public synchronized void putInteger(String str, @InterfaceC11300zs1 Integer num) {
        try {
            if (num != null) {
                this.mBundle.putInt(str, num.intValue());
            } else {
                this.mBundle.remove(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void putSerializable(String str, Serializable serializable) {
        this.mBundle.putSerializable(str, serializable);
    }

    public synchronized void putString(String str, @InterfaceC11300zs1 String str2) {
        this.mBundle.putString(str, str2);
    }

    public synchronized void putStringArray(String str, String[] strArr) {
        this.mBundle.putStringArray(str, strArr);
    }

    public synchronized void putStringArrayList(String str, ArrayList<String> arrayList) {
        this.mBundle.putStringArrayList(str, arrayList);
    }

    public synchronized void reset(Bundle bundle) {
        this.mBundle.clear();
        this.mBundle.putAll(bundle);
    }

    public Bundle toBundle() {
        return new Bundle(this.mBundle);
    }

    public synchronized boolean getBoolean(String str, boolean z) {
        return this.mBundle.getBoolean(str, z);
    }
}
