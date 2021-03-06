/*
 * Copyright 2016 David Karnok
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package hu.akarnokd.agera;

import android.support.annotation.NonNull;

import com.google.android.agera.Updatable;
import com.google.android.agera.UpdateDispatcher;

/**
 * Dispatches update() signals to currently registered Updatables and provides
 * fluent API.
 */
public final class PublishingDispatcher extends AgeraTracking<Updatable> implements UpdateDispatcher {

    @NonNull
    @Override
    protected Updatable createWrapper(@NonNull Updatable updatable) {
        return updatable;
    }

    @Override
    protected void onAdd(@NonNull Updatable updatable, @NonNull Updatable wrapper) {

    }

    @Override
    protected void onRemove(@NonNull Updatable updatable, @NonNull Updatable wrapper) {

    }

    @Override
    public void update() {
        for (Updatable u : map.values()) {
            u.update();
        }
    }
}
