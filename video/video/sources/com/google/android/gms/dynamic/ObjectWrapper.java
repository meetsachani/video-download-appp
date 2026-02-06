package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.RetainForClient;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
import o.InterfaceC5670cr1;

@RetainForClient
@KeepForSdk
/* loaded from: classes2.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {
    public final Object X;

    public ObjectWrapper(Object obj) {
        this.X = obj;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static <T> IObjectWrapper V3(@InterfaceC5670cr1 T t) {
        return new ObjectWrapper(t);
    }

    @ResultIgnorabilityUnspecified
    @InterfaceC5670cr1
    @KeepForSdk
    public static <T> T o1(@InterfaceC5670cr1 IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return (T) ((ObjectWrapper) iObjectWrapper).X;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            Preconditions.r(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("Binder object is null.", e2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
    }
}
