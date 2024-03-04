# CMakeLists.txt for vsomeip application

# Specify the minimum CMake version required
cmake_minimum_required(VERSION 3.0)

# Project name
project(vsomeip_example)

# Source file
set(SRC main.cpp)

# Add include directories
include_directories(
    /workspaces/blackberry-ivy-playground/vsomeip/interface
    /workspaces/blackberry-ivy-playground/boostlibs/boost-1.63-qnx710/target/qnx7/usr/include
    /workspaces/blackberry-ivy-playground/jsonlib
)

# Add library directories
link_directories(
    //workspaces/blackberry-ivy-playground/boostlibs/boost-1.63-qnx710/target/qnx7/aarch64le/usr/lib
    /workspaces/blackberry-ivy-playground/vsomeip3libs
)

# Define the vsomeipClient target
add_executable(vsomeipClient ${SRC})

# Link libraries to vsomeipClient
target_link_libraries(vsomeipClient
    vsomeip3-cfg
    vsomeip3-e2e
    vsomeip3-sd
    vsomeip3
    boost_atomic
    boost_chrono
    boost_container
    boost_context
    boost_coroutine
    boost_date_time
    boost_fiber
    boost_filesystem
    boost_graph
    boost_iostreams
    boost_locale
    boost_log_setup
    boost_log
    boost_math_c99f
    boost_math_c99l
    boost_math_c99
    boost_math_tr1f
    boost_math_tr1l
    boost_math_tr1
    boost_prg_exec_monitor
    boost_program_options
    boost_random
    boost_regex
    boost_serialization
    boost_signals
    boost_system
    boost_thread
    boost_timer
    boost_type_erasure
    boost_unit_test_framework
    boost_wave
    boost_wserialization
)
