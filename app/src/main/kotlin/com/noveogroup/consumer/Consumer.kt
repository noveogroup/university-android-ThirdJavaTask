package com.noveogroup.consumer

import com.noveogroup.data.Data

/**
 * Class which consumes elements.
 */
interface Consumer {
    fun consumeData(data: Data)
}
