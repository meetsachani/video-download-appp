package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {
    public AbstractWindowedCursor X;

    @KeepForSdk
    public CursorWrapper(@InterfaceC5670cr1 Cursor cursor) {
        super(cursor);
        for (int i = 0; i < 10 && (cursor instanceof android.database.CursorWrapper); i++) {
            cursor = ((android.database.CursorWrapper) cursor).getWrappedCursor();
        }
        if (cursor instanceof AbstractWindowedCursor) {
            this.X = (AbstractWindowedCursor) cursor;
            return;
        }
        throw new IllegalArgumentException("Unknown type: ".concat(cursor.getClass().getName()));
    }

    @KeepForSdk
    public void a(@InterfaceC11300zs1 CursorWindow cursorWindow) {
        this.X.setWindow(cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @KeepForSdk
    public void fillWindow(int i, @InterfaceC5670cr1 CursorWindow cursorWindow) {
        this.X.fillWindow(i, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @ResultIgnorabilityUnspecified
    @InterfaceC11300zs1
    @KeepForSdk
    public CursorWindow getWindow() {
        return this.X.getWindow();
    }

    @Override // android.database.CursorWrapper
    @InterfaceC5670cr1
    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.X;
    }

    @Override // android.database.CrossProcessCursor
    @ResultIgnorabilityUnspecified
    public final boolean onMove(int i, int i2) {
        return this.X.onMove(i, i2);
    }
}
