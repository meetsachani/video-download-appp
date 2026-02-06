package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class DataBufferUtils {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String a = "next_page_token";
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String b = "prev_page_token";

    private DataBufferUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5670cr1
    public static <T, E extends Freezable<T>> ArrayList<T> a(@InterfaceC5670cr1 DataBuffer<E> dataBuffer) {
        ArrayList<T> arrayList = (ArrayList<T>) new ArrayList(dataBuffer.getCount());
        try {
            for (E e : dataBuffer) {
                arrayList.add(e.freeze());
            }
            return arrayList;
        } finally {
            dataBuffer.close();
        }
    }

    public static boolean b(@InterfaceC5670cr1 DataBuffer<?> dataBuffer) {
        if (dataBuffer != null && dataBuffer.getCount() > 0) {
            return true;
        }
        return false;
    }

    public static boolean c(@InterfaceC5670cr1 DataBuffer<?> dataBuffer) {
        Bundle o0 = dataBuffer.o0();
        if (o0 != null && o0.getString(a) != null) {
            return true;
        }
        return false;
    }

    public static boolean d(@InterfaceC5670cr1 DataBuffer<?> dataBuffer) {
        Bundle o0 = dataBuffer.o0();
        if (o0 != null && o0.getString(b) != null) {
            return true;
        }
        return false;
    }
}
