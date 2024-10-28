/*
 * Copyright (c) Kacper Ziubryniewicz 2019-10-23
 */

package pl.szczodrzynski.edziennik.data.api.edziennik.librus.data.synergia

import pl.szczodrzynski.edziennik.data.api.edziennik.librus.DataLibrus
import pl.szczodrzynski.edziennik.data.api.edziennik.librus.data.LibrusSynergia

class LibrusSynergiaTemplate(override val data: DataLibrus,
                             val onSuccess: () -> Unit
) : LibrusSynergia(data, null) {
    companion object {
        const val TAG = "LibrusSynergia"
    }

    init {
        /* synergiaGet(TAG, "") { text ->
            val doc = Jsoup.parse(text)

            data.setSyncNext(ENDPOINT_LIBRUS_SYNERGIA_, SYNC_ALWAYS)
            onSuccess()
        } */
    }
}
